package cc.hw3a.spring.fruit;

public class Fruit {
	private Integer id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Fruit{");
		sb.append("id = ").append(getId());
		sb.append(", name = ").append(getName());
		return sb.append("}").toString();
	}

}
