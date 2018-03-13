package quanyec.thinkblog.action.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import quanyec.thinkblog.pojo.Blog;
import util.Utils;

/**
 * 新建一个博客
 * 
 * @author quanyeChen
 *
 */
public class NewBlogAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private String content;

	@Override
	public String execute() throws Exception {
		if (Utils.getSessionHashCode() == null) {
			return NONE;
		}
		// 加载tinyMCE来给管理员写博客
		return SUCCESS;
	}

	public String commitBlog() throws Exception {
		if (Utils.getSessionHashCode() == null) {
			return NONE;
		}
		SessionFactory sf = Utils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Blog blog = new Blog();
		blog.setAuthor(author);
		blog.setTitle(title);
		blog.setContent(content);
		blog.setDate(new Date());
		session.save(blog);

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

}
