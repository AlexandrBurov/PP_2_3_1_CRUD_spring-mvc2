package web.util;

    public class Util {

//        private static final String URL_U = "jdbc:mysql://localhost:3306/SpringMVC";
//        private static final String USER_U = "root";
//        private static final String PASSWORD_U = "rootroot";
//
//
////---------------------------------------------------
//        private static SessionFactory sessionFactory;
////---------------------------------------------------
//
//        public static SessionFactory getSessionFactory() {
//
//            if (sessionFactory == null) {
//                try {
//
//                    Properties settings = new Properties();
//
//                    settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//                    settings.put(Environment.URL, URL_U);
//                    settings.put(Environment.USER, USER_U);
//                    settings.put(Environment.PASS, PASSWORD_U);
//                    settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//                    settings.put(Environment.SHOW_SQL, "true");
//                    settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//                    settings.put(Environment.HBM2DDL_AUTO, "update");
//
//                    Configuration configuration = new Configuration();
//                    configuration.setProperties(settings);
//                    configuration.addAnnotatedClass(User.class);
//
//                    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                            .applySettings(configuration.getProperties()).build();
//
//                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//
//                    System.out.println("Connection OK");
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            return sessionFactory;
//        }


    }
