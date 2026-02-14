package com.mycompany.agency;

public class Intern extends StaffEmployee
{
    public Intern(String eName, String eAddress, String ePhone, String socSecNumber)
    {
        super(eName, eAddress, ePhone, socSecNumber, 0);
    }

    public double pay()
    {
        return 0;
    }
}
