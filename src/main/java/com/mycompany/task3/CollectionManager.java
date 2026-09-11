/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3;

/**
 *
 * @author sr891
 */
import java.util.*;

public class CollectionManager {

    public void demonstrateCollections() {
        System.out.println("==================================================");
        System.out.println("     DEPI - Java Collections Demonstration        ");
        System.out.println("==================================================");

        // 1. One-Dimensional Array (Array)
        // Used for a fixed-size collection of primitive values or objects.
        System.out.println("\n--- 1. One-Dimensional Array ---");
        int[] itemIds = {101, 102, 103, 104};
        for (int i = 0; i < itemIds.length; i++) {
            System.out.println("Item ID at index " + i + ": " + itemIds[i]);
        }

        // 2. Two-Dimensional Array (2D Array)
        // Used to store tabular data (e.g., ID and Price pairs).
        System.out.println("\n--- 2. Two-Dimensional Array ---");
        double[][] itemData = {
            {101, 500},
            {102, 700},
            {103, 25000},
            {104, 7000}
        };
        for (int i = 0; i < itemData.length; i++) {
            System.out.println("ID: " + (int)itemData[i][0] + " | Price: $" + itemData[i][1]);
        }

        // 3. ArrayList
        // Used for dynamic lists where fast random access by index is needed.
        System.out.println("\n--- 3. ArrayList ---");
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(101, "Wireless Mouse", 500));
        itemList.add(new Item(102, "Mechanical Keyboard", 700));
        
        for (Item item : itemList) {
            System.out.println(item);
        }

        // 4. LinkedList
        // Used when frequent insertions and deletions are required.
        System.out.println("\n--- 4. LinkedList ---");
        LinkedList<String> trackingLogs = new LinkedList<>();
        trackingLogs.add("Order Placed");
        trackingLogs.add("Order Packed");
        trackingLogs.addFirst("System Init"); // Fast insertion at beginning
        trackingLogs.addLast("Order Shipped"); // Fast insertion at end
        
        for (String log : trackingLogs) {
            System.out.println("Log: " + log);
        }

        // 5. HashSet
        // Used to store unique elements (no duplicates allowed) with fast lookup.
        System.out.println("\n--- 5. HashSet ---");
        HashSet<String> uniqueCategories = new HashSet<>();
        uniqueCategories.add("Electronics");
        uniqueCategories.add("Accessories");
        uniqueCategories.add("Electronics"); // Duplicate, will be ignored
        
        System.out.println("Categories (Unique): " + uniqueCategories);

        // 6. HashMap
        // Used for key-value pair storage for fast searching by a unique key (e.g., ID -> Item).
        System.out.println("\n--- 6. HashMap ---");
        HashMap<Integer, Item> itemMap = new HashMap<>();
        Item item1 = new Item(101, "Wireless Mouse", 500);
        Item item2 = new Item(103, "Gaming Laptop", 25000);
        
        itemMap.put(item1.getId(), item1);
        itemMap.put(item2.getId(), item2);

        // Searching/Accessing using key
        int searchKey = 103;
        if (itemMap.containsKey(searchKey)) {
            System.out.println("Found item with key " + searchKey + ": " + itemMap.get(searchKey));
        }
        
        System.out.println("==================================================");
    }
}