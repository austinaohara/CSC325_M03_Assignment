package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList

        staffList[0] =new Executive("James L.", "123 Elm St","532-932-3422","235-42-3233",2000.00);
        staffList[1] =new StaffEmployee("Sam k.", "400 Broadway","242-244-1311","532-24-8876",234.00);
        staffList[2] =new StaffEmployee("John.", "6 Newbridge Rd","745-134-4312","122-55-8777",366.00);
        staffList[5] =new TempEmploee("David M.", "5 Park Ave","123-932-3422","241-43-5123",53.00);
        staffList[4] =new Intern("Matthew R.", "27 Lincoln Ave","213-124-1244","623-22-3466");
        staffList[3] =new Intern("Jennifer M.", "74 William St","214-932-3422","123-34-4343");


        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
