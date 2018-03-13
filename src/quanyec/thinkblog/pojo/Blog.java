package quanyec.thinkblog.pojo;

import java.util.Date;

/**
 * 博客类
 * 
 * @author quanyeChen
 *
 */
public class Blog {
	private int id;
	private String title;
	private String author;
	private Date date;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj.getClass() == Blog.class) {
			Blog blog = (Blog) obj;
			if (blog.getId() == this.id && blog.getTitle().equals(this.title)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "[id = " + id + ", author=" + author + ", title=" + title + "]";
	}

}
