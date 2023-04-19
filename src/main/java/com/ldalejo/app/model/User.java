package com.ldalejo.app.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable{


	private static final long serialVersionUID = 6581010402944198035L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 25)
	private String name;
	
	@Column(length = 25)
	private String surname;
	
	@Column(length = 20)
	private String nick_name;
	
	@Column(length = 50 , nullable=false, unique= true)
	private String email;
	
	@Column(length = 15)
	private String phoneNumber;
	
	@Column(length = 15)
	private String password;
	
	@Column()
	private Role role;
	
}
