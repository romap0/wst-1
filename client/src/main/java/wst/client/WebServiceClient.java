package wst.client;


import wst.generated.Shop;
import wst.generated.ShopService;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/app/ShopService?wsdl");
        ShopService shopService = new ShopService(url);

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Find shops: ");

            System.out.print("Name: ");
            String name = checkNull(in.nextLine());

            System.out.print("\nCity: ");            
            String city = checkNull(in.nextLine());
            
            System.out.print("\nAddress: ");
            String address = checkNull(in.nextLine());

            System.out.print("\nActive (y/n): ");
            Boolean isActive = checkBoolean(in.nextLine());

            System.out.print("\nType: ");
            String type = checkNull(in.nextLine());

            List<Shop> shops = shopService
                .getShopWebServicePort()
                .filter(name, city, address, isActive, type);

            if (shops.isEmpty()) {
                System.out.println("Did not found any shops");
            }
            else {
                for (Shop shop : shops) {
                    System.out.println("name: " + shop.getName() +
                            ", address: " + shop.getAddress() + " active: " + shop.isIsActive());
                }
                
                System.out.println("Total shops: " + shops.size());
            }
        }
    }

    public static String checkNull (String s) {
        return s.length() == 0 ? null : s;
    }

    public static Boolean checkBoolean(String s) {
        if (s.length() == 0) return null;

        return s.equals("y") ? Boolean.TRUE : Boolean.FALSE;
    }
};