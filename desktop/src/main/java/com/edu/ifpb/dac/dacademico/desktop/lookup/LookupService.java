package com.edu.ifpb.dac.dacademico.desktop.lookup;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class LookupService {

    public static <T> T lookup (String recurso, Class<T> tipo){
        try{
            Properties prop = new Properties();
            prop.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
            prop.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            prop.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext context = new InitialContext(prop);
            return (T) context.lookup(recurso);
        } catch (NamingException ne) {            
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }
}
