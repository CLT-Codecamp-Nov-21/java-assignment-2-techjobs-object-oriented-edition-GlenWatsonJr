package org.launchcode.techjobs.oo.test;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
       Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3 instanceof Job);
        assertEquals("Product tester", job3.getName());
        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals("ACME", job3.getEmployer().getValue());
        assertTrue(job3.getLocation() instanceof Location);
        assertEquals("Desert", job3.getLocation().getValue());
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Web Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Front End Development"), new CoreCompetency("JavaScript"));
        Job job5 = new Job("Web Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Front End Development"), new CoreCompetency("JavaScript"));
        assertFalse(job4.getId() == job5.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job6 = new Job("Web Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Front End Development"), new CoreCompetency("JavaScript"));
        assertEquals("\n", job6.toString().substring(0,1));
        assertEquals("\n", job6.toString().substring(job6.toString().length()-1,job6.toString().length()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job7 = new Job("Web Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Front End Development"), new CoreCompetency("JavaScript"));
        assertEquals("\nID: 4\n" +
                "Name: Web Developer\n" +
                "Employer: LaunchCode\n" +
                "Location: Charlotte\n" +
                "Position Type: Front End Development\n" +
                "Core Competency: JavaScript\n", job7.toString());
     }

    @Test
    public void testToStringHandlesEmptyField(){
         Job job8 = new Job("Test Case", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
         assertEquals("\nID: 3\n" +
                 "Name: Test Case\n" +
                 "Employer: Data not available\n" +
                 "Location: Data not available\n" +
                 "Position Type: Data not available\n" +
                 "Core Competency: Data not available\n", job8.toString());

    }
}
