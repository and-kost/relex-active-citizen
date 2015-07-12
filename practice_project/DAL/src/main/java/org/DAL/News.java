package org.DAL;

import java.util.Date;

import javax.persistence.*;


@Entity
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROGECT_SEQ")
	@SequenceGenerator(name = "PROGECT_SEQ", sequenceName = "project_seq", 
		initialValue = 1, allocationSize = 1)
	@Column(name = "id", unique = true, nullable = false, insertable = true, 
	updatable = true)
	private long id;
	
	@Column(name = "title", unique = false, nullable = false, insertable = true, 
			updatable = true)
	private String title;
	
	@Column(name = "text", unique = false, nullable = false, insertable = true, 
			updatable = true)
	private String text;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "date", unique = false, nullable = false, insertable = true, 
			updatable = true)
	private Date date;
	
	@ManyToOne(targetEntity = Admin.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "authorId", referencedColumnName = "adminId", unique = false, 
		nullable = false, insertable = true, updatable = false)
	private Admin author;
	
	public News() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Admin getAuthor() {
		return author;
	}

	public void setAuthor(Admin author) {
		this.author = author;
	}
	

}