package co.edu.campusucc.sd.daos;
// Generated 28/03/2020 03:03:48 AM by Hibernate Tools 5.4.7.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import co.edu.campusucc.sd.modelo.ReporteGiro;
import co.edu.campusucc.sd.modelo.ReporteGiroId;

/**
 * Home object for domain model class ReporteGiro.
 * @see co.edu.campusucc.sd.modelo.ReporteGiro
 * @author Hibernate Tools
 */
public class ReporteGiroHome {

	private static final Logger logger = Logger.getLogger(ReporteGiroHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ReporteGiro transientInstance) {
		logger.log(Level.INFO, "persisting ReporteGiro instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReporteGiro instance) {
		logger.log(Level.INFO, "attaching dirty ReporteGiro instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReporteGiro instance) {
		logger.log(Level.INFO, "attaching clean ReporteGiro instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(ReporteGiro persistentInstance) {
		logger.log(Level.INFO, "deleting ReporteGiro instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public ReporteGiro merge(ReporteGiro detachedInstance) {
		logger.log(Level.INFO, "merging ReporteGiro instance");
		try {
			ReporteGiro result = (ReporteGiro) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public ReporteGiro findById(co.edu.campusucc.sd.modelo.ReporteGiroId id) {
		logger.log(Level.INFO, "getting ReporteGiro instance with id: " + id);
		try {
			ReporteGiro instance = (ReporteGiro) sessionFactory.getCurrentSession()
					.get("co.edu.campusucc.sd.modelo.ReporteGiro", id);
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

	public List findByExample(ReporteGiro instance) {
		logger.log(Level.INFO, "finding ReporteGiro instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.edu.campusucc.sd.modelo.ReporteGiro")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
