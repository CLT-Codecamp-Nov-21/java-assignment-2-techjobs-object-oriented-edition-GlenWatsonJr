package org.launchcode.techjobs.oo.test;


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
}
