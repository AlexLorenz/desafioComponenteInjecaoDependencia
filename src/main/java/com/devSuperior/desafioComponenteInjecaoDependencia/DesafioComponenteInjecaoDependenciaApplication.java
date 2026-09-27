package com.devSuperior.desafioComponenteInjecaoDependencia;

import com.devSuperior.desafioComponenteInjecaoDependencia.entities.Order;
import com.devSuperior.desafioComponenteInjecaoDependencia.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioComponenteInjecaoDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	static void main(String[] args) {
		SpringApplication.run(DesafioComponenteInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int codeOrder1 = 1034;
		double basicOrder1 = 150.00;
		double discountOrder1 = 20.0;

		int codeOrder2 = 2282;
		double basicOrder2 = 800.00;
		double discountOrder2 = 10.0;

		int codeOrder3 = 1309;
		double basicOrder3 = 95.90;
		double discountOrder3 = 0.0;

		Order order1 = new Order(codeOrder1, basicOrder1, discountOrder1);
		Order order2 = new Order(codeOrder2, basicOrder2, discountOrder2);
		Order order3 = new Order(codeOrder3, basicOrder3, discountOrder3);

		System.out.println("O valor final do Pedido " + order1.getCode() + " será: " + orderService.calcularValorFinal(order1));
		System.out.println("O valor final do Pedido " + order2.getCode() + " será: " + orderService.calcularValorFinal(order2));
		System.out.println("O valor final do Pedido " + order3.getCode() + " será: " + orderService.calcularValorFinal(order3));
	}
}
