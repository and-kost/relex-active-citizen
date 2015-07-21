package org.DAL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserRoles")
public class UserRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLES_SEQ")
	@SequenceGenerator(name = "ROLES_SEQ", sequenceName = "roles_seq", 
		initialValue = 1, allocationSize = 1)
	@Column(name = "id", unique = true, nullable = false, insertable = true, 
	updatable = true)
	protected long id;
	
	@Column(name = "login", unique = true, nullable = false, insertable = true, 
			updatable = true, length = 45)
	protected String login;
	
	@Column(name = "role", unique = true, nullable = false, insertable = true, 
			updatable = true, length = 45)
	protected String role;

}
