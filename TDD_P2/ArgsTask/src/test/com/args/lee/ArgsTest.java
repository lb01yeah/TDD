package com.args.lee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgsTest {
    @Test
    public void test(){
        Args args = new Args("l:bool,d:str,p:int","-l true -d /usr/local -p 8080");
        assertEquals(args.getValue("l"),Boolean.TRUE);
        assertEquals(args.getValue("d"),"/usr/local");
        assertEquals(args.getValue("p"), new Integer(8080));
    }

    @Test
    public void test_with_number(){
        Args args = new Args("l:bool,d:str,p:int","-l -d /usr/local -p -9");
        assertEquals(args.getValue("l"),Boolean.FALSE);
        assertEquals(args.getValue("d"),"/usr/local");
        assertEquals(args.getValue("p"),new Integer(-9));
    }
}
