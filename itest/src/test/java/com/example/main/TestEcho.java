package com.example.main;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestEcho
{
    @Test
    public void testEcho() throws Exception
    {
        EchoService svc = new EchoService();
        assertEquals("echo completed", "foo", svc.echo("foo"));
    }
}
