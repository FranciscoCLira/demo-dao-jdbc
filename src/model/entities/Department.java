package model.entities;

import java.io.Serializable;
import java.util.Objects;

     // Implements Serializable (para os objetos poderem ser transformados em sequencia de dados para gravao em arquivos) 

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer Id;
	private String name;

	public Department() {
}

	public Department(Integer id, String name) {
		Id = id;
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// HashCode and equals  (para que os objetos possam ser comparados pelo conteudo e não por ponteiros)  
	
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}
	
	// toSring (para ter a facilidade de imprimir os objetos na hora que tiver testando)

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}
}