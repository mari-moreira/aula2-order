package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class OrderSummary {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		// Dados dos cleintes

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = dt.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		// Dados do pedido

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		// Preenchimeto dos produtos

		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		
		// Adicionando o produto
		for (int i = 0; i < items; i++) {
			System.out.println("Enter # " + (i + 1) + " item data: ");
			System.out.print("Product name :");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Product price : ");
			double price = sc.nextDouble();
			
			Product product = new Product(nome, price);

			System.out.print("Quantity : ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, price, product);
			// Adicionando na lista
			order.addItem(orderItem);

		}
		System.out.println("ORDER SUMARY :");
		System.out.println(order);

		sc.close();

	}

}
