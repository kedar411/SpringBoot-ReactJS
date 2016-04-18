package guru.springframework.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Customer implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    
    @Column(name="name")	
    String name;

    @Column(name="type")	
    String type;

    @Column(name="email")	
    String email;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}


