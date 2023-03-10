package com.carflow.backend.infrastructure.boundaries.out.order.implementations;

import com.carflow.backend.domains.order.models.Order;
import com.carflow.backend.domains.order.interfaces.OrderStorage;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

@Service
@Profile("mememoryStorage")
public class OrderStorageMemory implements OrderStorage {
    private HashMap<String, Order> orders = new HashMap<String, Order>();
    private Integer nextId = 0;

    public OrderStorageMemory() {
        createNewOrder(
                new Order(
                        null,
                        null,
                        "Stefan Wymyślony",
                        "PZU",
                        null,
                        "ZA230307000024",
                        "D",
                        "ul. Wymyślona 14, 54-325 Niblandia, Polska",
                        "2023.03.07",
                        "18:15",
                        "Komentarz do wydania",
                        "wroclaw-lotnisko",
                        "ul. Wymyślona 14, 54-325 Niblandia, Polska",
                        "2023.03.17",
                        "18:25",
                        "Komentarz do zwrotu",
                        "wroclaw-lotnisko",
                        false,
                        null
                )
        );
    }


    private Integer counter = 0;
    private String getInternalCaseNumber() {
        counter++;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
        LocalDateTime time = LocalDateTime.now();
        return "CF" + dtf.format(time) +  counter;
    }

    @Override
    public Order createNewOrder(Order order) {
        String id = (++nextId).toString();
        orders.put(
                id,
                new Order(
                        nextId,
                        "ACCEPTED",
                        order.getClientsData(),
                        order.getPrincipal(),
                        getInternalCaseNumber(),
                        order.getExternalCaseNumber(),
                        order.getSegment(),
                        order.getDeliveryAddress(),
                        order.getDeliveryDate(),
                        order.getDeliveryTime(),
                        order.getDeliveryComments(),
                        order.getDeliveryBranch(),
                        order.getReturnAddress(),
                        order.getReturnDate(),
                        order.getReturnTime(),
                        order.getReturnComments(),
                        order.getReturnBranch(),
                        false,
                        null
                )
        );
        Order orderResponse = orders.get(id);
        return orderResponse;
    }

    @Override
    public List<Order> getAllOrders() {
        return orders.values().stream().toList();
    }

    @Override
    public List<Order> getOrders(List<String> statuses) {
        return orders.values().stream().filter(order ->  statuses.contains(order.getStatus())).toList();
    }

    @Override
    public Order getOrderById(String id) throws ObjectNotFoundException {
        if (orders.containsKey(id)) {
            return orders.get(id);
        } else {
            throw new ObjectNotFoundException("The order with the given ID does not exist in the database.");
        }
    }

    @Override
    public Order updateOrderById(String id, Order order) throws ObjectNotFoundException {
        if (orders.containsKey(id)) {
            orders.remove(id);
            orders.put(id, order);
            return orders.get(id);
        } else {
            throw new ObjectNotFoundException("The order with the given ID does not exist in the database.");
        }
    }

    @Override
    public void moveToArchiveById(String id) throws ObjectNotFoundException {
        if (orders.containsKey(id)) {
            Order oldOrder = orders.get(id);
            Order newOrder = orders.get(id);
            newOrder.setArchive(true);
            orders.replace(id,oldOrder, newOrder);
        } else {
            throw new ObjectNotFoundException("The order with the given ID does not exist in the database.");
        }
    }

    @Override
    public void moveToCancelledById(String id, String message) throws ObjectNotFoundException {
        if (orders.containsKey(id)) {
            Order oldOrder = orders.get(id);
            Order newOrder = orders.get(id);
            newOrder.setStatus("CANCELLED");
            newOrder.setReasonForCancelingTheOrder(message);
            orders.replace(id,oldOrder, newOrder);
        } else {
            throw new ObjectNotFoundException("The order with the given ID does not exist in the database.");
        }
    }

    @Override
    public void deleteOrderById(String id) throws ObjectNotFoundException {
        if (orders.containsKey(id)) {
            orders.remove(id);
        } else {
            throw new ObjectNotFoundException("The order with the given ID does not exist in the database.");
        }
    }
}
