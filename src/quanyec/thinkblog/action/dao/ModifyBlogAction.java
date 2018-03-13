package quanyec.thinkblog.action.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import quanyec.thinkblog.pojo.Blog;
import util.Utils;

/**
 * 修改博客
 * 
 * @author quanyeChen
 *
 */
public class ModifyBlogAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String author;
	private String content;

	@Override
	public String execute() throws Exception {
		if (Utils.getSessionHashCode() == null) {
			return NONE;
		}
		SessionFactory sf = Utils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Blog blog = session.get(Blog.class, id);
		author = blog.getAuthor();
		title = blog.getTitle();
		content = blog.getContent();

		tx.commit();
		session.close();

		return SUCCESS;
	}

	public String modifyCommit() throws Exception {
		if (Utils.getSessionHashCode() == null) {
			return NONE;
		}
		SessionFactory sf = Utils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Blog blog = session.get(Blog.class, id);
		blog.setAuthor(author);
		blog.setContent(content);
		blog.setDate(new Date());
		blog.setTitle(title);

		tx.commit();
		session.close();
		return SUCCESS;
	}

	public String getTitle() {
		return title;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
