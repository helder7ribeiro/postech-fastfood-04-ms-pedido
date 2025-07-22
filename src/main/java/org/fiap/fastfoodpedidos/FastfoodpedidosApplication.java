package org.fiap.fastfoodpedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FastfoodpedidosApplication {

	public static void main(String[] args) {
		System.out.println("==== VARIÁVEIS DE AMBIENTE (System.getenv) ====");
		System.out.println("APPLICATION_URL            => " + System.getenv("APPLICATION_URL"));
		System.out.println("ENDERECO_FILA_pedidos      => " + System.getenv("ENDERECO_FILA_pedidos"));
		System.out.println("APP_SERVICES_PRODUTOS      => " + System.getenv("APP_SERVICES_PRODUTOS"));
		System.out.println("APP_SERVICES_PAGAMENTOS    => " + System.getenv("APP_SERVICES_PAGAMENTOS"));
		System.out.println("PROFILE                    => " + System.getenv("PROFILE"));
		System.out.println("SPRING_DATASOURCE_URL      => " + System.getenv("SPRING_DATASOURCE_URL"));
		System.out.println("SPRING_DATASOURCE_USERNAME => " + System.getenv("SPRING_DATASOURCE_USERNAME"));
		System.out.println("SPRING_DATASOURCE_PASSWORD => " + System.getenv("SPRING_DATASOURCE_PASSWORD"));
		System.out.println("AWS_ACCESS_KEY             => " + System.getenv("AWS_ACCESS_KEY"));
		System.out.println("AWS_SECRET_KEY             => " + System.getenv("AWS_SECRET_KEY"));
		System.out.println("AWS_SESSION_TOKEN          => " + System.getenv("AWS_SESSION_TOKEN"));
		System.out.println("AWS_REGION                 => " + System.getenv("AWS_REGION"));


		SpringApplication.run(FastfoodpedidosApplication.class, args);
	}

}
