package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
     @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_case1() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_case2() {
       Object other = new Object();
       assertFalse(team.equals(other));
    }
    
    @Test
    public void equals_case3() {
        Team other = new Team("test-team");
        assertTrue((team.name.equals(other.name) && team.members.equals(other.members)));

        Team other2 = new Team("other-team");
        assertFalse(team.equals(other2));
    }

    @Test
    public void test_hashCode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        
        int result = t1.hashCode();
        int expectedResult=130294;
        assertEquals(expectedResult, result);
    }
}
