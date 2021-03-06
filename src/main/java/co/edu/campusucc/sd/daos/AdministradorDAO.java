package co.edu.campusucc.sd.daos;
// Generated 28/03/2020 03:03:48 AM by Hibernate Tools 5.4.7.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import co.edu.campusucc.sd.modelo.Administrador;

/**
 * Home object for domain model class Administrador.
 * 
 * @see co.edu.campusucc.sd.modelo.Administrador
 * @author Hibernate Tools
 */
public class AdministradorDAO {

	private static final Logger logger = Logger.getLogger(AdministradorDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			// return (SessionFactory) new InitialContext().lookup("SessionFactory");
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error creando sessionFactory", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Administrador transientInstance) {
		logger.log(Level.INFO, "persisting Administrador instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();

			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			if (tx != null)
				tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public void attachDirty(Administrador instance) {
		logger.log(Level.INFO, "attaching dirty Administrador instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(Administrador instance) {
		logger.log(Level.INFO, "attaching clean Administrador instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(Administrador persistentInstance) {
		logger.log(Level.INFO, "deleting Administrador instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public Administrador merge(Administrador detachedInstance) {
		logger.log(Level.INFO, "merging Administrador instance");
		try {
			Administrador result = (Administrador) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Administrador findById(java.lang.String id) {
		logger.log(Level.INFO, "getting Administrador instance with id: " + id);
		try {
			Administrador instance = (Administrador) sessionFactory.getCurrentSession()
					.get("co.edu.campusucc.sd.modelo.Administrador", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(Administrador instance) {
		logger.log(Level.INFO, "finding Administrador instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.edu.campusucc.sd.modelo.Administrador")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
