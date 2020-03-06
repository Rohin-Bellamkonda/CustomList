package com.Epam.CustomList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        List<Integer> list = new List<>();
        list.add(100);
        list.add(322);
        list.add(439);
        list.add(78);
        LOGGER.debug(list);
        list.remove(2);
        LOGGER.debug(list);
        LOGGER.debug(list.get(0) );
        LOGGER.debug(list.get(1) );
        LOGGER.debug(list.size());
        List<String>list2=new List<>();
        list2.add("hi");
        list2.add("Hello");
        list2.add("Bye");
        list2.add("Come");
        LOGGER.debug(list2);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list2.size());
        list2.remove(2);
        LOGGER.debug(list2);
    }
}