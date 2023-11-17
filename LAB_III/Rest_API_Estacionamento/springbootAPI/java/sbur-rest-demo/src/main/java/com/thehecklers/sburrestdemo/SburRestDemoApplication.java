package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/carros")
@CrossOrigin(origins = "*")
class RestApiDemoController {
	private List<Carro> carros = new ArrayList<>();

	public RestApiDemoController() {
		carros.addAll(List.of(
				new Carro("HUM0873", "Gol", "vw", "Branco", 20000),
				new Carro("HPO6481", "Fox", "Fiat", "Preto", 25000),
				new Carro("IAK3244", "Fusca", "Ferrari", "Branco", 10000),
				new Carro("GTX3030", "Gol", "vw", "Preto", 15000),
				new Carro("MAY7304", "Fox", "Fiat", "Cinza", 18000),
				new Carro("MMT9344", "Fusca", "Ferrari", "Cinza", 33000),
				new Carro("MUT9371", "Gol", "vw", "Preto", 31000),
				new Carro("IAM0763", "Fox", "Fiat", "Branco", 23000),
				new Carro("MVZ0901", "Fusca", "Ferrari", "Cinza", 24000)
		));
	}

	@GetMapping
	Iterable<Carro> getCarros() {
		return carros;
	}

	@PostMapping
	Carro postCarro(@RequestBody Carro carro) {
		carros.add(carro);
		return carro;
	}

	//MAPPING PARA MODELO
	@GetMapping("/modelo/{modelo}")
	ArrayList<Carro> getCarroByModelo(@PathVariable String modelo) {
		ArrayList<Carro> modelosAchados = new ArrayList<>();
		for (Carro c: carros) {
			// System.out.println(c.getModelo());
			if (c.getModelo().toLowerCase().equals(modelo)) {
				modelosAchados.add(c);
			}
		}

		return modelosAchados;
	}

	//MAPPING PARA MARCA
	@GetMapping("/marca/{marca}")
	ArrayList<Carro> getCarroByMarca(@PathVariable String marca) {
		ArrayList<Carro> marcasAchadas = new ArrayList<>();
		for (Carro c: carros) {
			// System.out.println(c.getModelo());
			if (c.getMarca().toLowerCase().equals(marca)) {
				marcasAchadas.add(c);
			}
		}

		return marcasAchadas;
	}

	//MAPPING PARA COR
	@GetMapping("/cor/{cor}")
	ArrayList<Carro> getCarroByCor(@PathVariable String cor) {
		ArrayList<Carro> coresAchadas = new ArrayList<>();
		for (Carro c: carros) {
			// System.out.println(c.getModelo());
			if (c.getCor().toLowerCase().equals(cor)) {
				coresAchadas.add(c);
			}
		}

		return coresAchadas;
	}

	//MAPPING PARA TODOS ATRIBUTOS
	@CrossOrigin(origins = "*")
	@GetMapping("/modelo/{modelo}/marca/{marca}/cor/{cor}")
	ArrayList<Carro> getCarroByAllAtributes(@PathVariable String modelo, @PathVariable String marca, @PathVariable String cor) {
		ArrayList<Carro> carrosAchados = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getModelo().toLowerCase().equals(modelo) 
			&& carro.getMarca().toLowerCase().equals(marca) 
			&& carro.getCor().toLowerCase().equals(cor)) {
				carrosAchados.add(carro);
			}
		}

		return carrosAchados;
	}

	//MAPPING PARA DOIS ATRIBUTOS
	@GetMapping("/modelo/{modelo}/marca/{marca}")
	ArrayList<Carro> getCarroByMarcaModelo(@PathVariable String modelo, @PathVariable String marca) {
		ArrayList<Carro> carrosAchados = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getModelo().toLowerCase().equals(modelo) 
			&& carro.getMarca().toLowerCase().equals(marca)) {
				carrosAchados.add(carro);
			}

		}
		return carrosAchados;
	}

	//MAPPING PARA DOIS ATRIBUTOS
	@GetMapping("/modelo/{modelo}/cor/{cor}")
	ArrayList<Carro> getCarroByCorModelo(@PathVariable String modelo, @PathVariable String cor) {
		ArrayList<Carro> carrosAchados = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getModelo().toLowerCase().equals(modelo) 
			&& carro.getCor().toLowerCase().equals(cor)) {
				carrosAchados.add(carro);
			}

		}
		return carrosAchados;
	}

	//MAPPING PARA DOIS ATRIBUTOS
	@GetMapping("/marca/{marca}/cor/{cor}")
	ArrayList<Carro> getCarroByMarcaCor(@PathVariable String marca, @PathVariable String cor) {
		ArrayList<Carro> carrosAchados = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getMarca().toLowerCase().equals(marca) 
			&& carro.getCor().toLowerCase().equals(cor)) {
				carrosAchados.add(carro);
			}

		}
		return carrosAchados;
	}
}

class Carro {
	private String placa;
	private String modelo;
	private String marca;
	private String cor;
	private Integer preco;


	public Carro(String placa, String modelo, String marca, String cor, Integer preco) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.preco = preco;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
} 