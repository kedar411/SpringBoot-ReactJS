package guru.springframework.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document implements Serializable{
	
    private static final long serialVersionUID = 1L;

    @Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name="name")	
    String name;

    @Column(name="type")	
    String type;

    @Column(name="subsssType")
    String subType;

	public Integer getId() {
		return id;
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

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
