package com.alquilatusvehiculos.alquila_tus_vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class AlquilaTusVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlquilaTusVehiculosApplication.class, args);
	}

}
