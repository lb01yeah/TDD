package com.args.lee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemasTest {

    @Test
    public void test_bool(){
        Schemas schemas = new Schemas("l:bool");
        assertEquals(schemas.getValue("l","true"),Boolean.TRUE);
        assertEquals(schemas.getValue("l","false"),Boolean.FALSE);
        assertEquals(schemas.getValue("l",null),Boolean.FALSE);
    }

    @Test
    public void test_int(){
        Schemas schemas = new Schemas("l:int");
        assertEquals(schemas.getValue("l","1"),new Integer(1));
    }

    @Test
    public void test_str(){
        Schemas schemas = new Schemas("l:str");
        assertEquals(schemas.getValue("l","hello"),"hello");
    }

}
