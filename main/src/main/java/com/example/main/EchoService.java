package com.example.main;

/**
 *  A very simple class that gives us something to assert. In the real world, this
 *  would be exposed as a web service.
 */
public class EchoService
{
    public String echo(String value)
    {
        return value;
    }
}
