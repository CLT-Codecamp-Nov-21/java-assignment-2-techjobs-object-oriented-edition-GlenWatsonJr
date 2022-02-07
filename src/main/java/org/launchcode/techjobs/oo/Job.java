package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        this.id = this.nextId;
        this.nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
            String idString = "ID: " + this.getId() + "\n";
            int isEmpty = 0;

            String nameString = "Name: " + this.name + "\n";
            if (this.name == ""){
                nameString = "Name: Data not available\n";
                isEmpty++;
            }

            String employerString = "Employer: " + this.getEmployer().getValue() + "\n";
            if (getEmployer().getValue() == ""){
                employerString = "Employer: Data not available\n";
                isEmpty++;
            }

            String locationString = "Location: " + this.getLocation().getValue() + "\n";
            if (getLocation().getValue() == ""){
                locationString = "Location: Data not available\n";
                isEmpty++;
            }

            String positionString = "Position Type: " + this.getPositionType().getValue() + "\n";
            if (getPositionType().getValue() == ""){
                positionString = "Position Type: Data not available\n";
                isEmpty++;
            }

            String coreCompetencyString = "Core Competency: " + this.getCoreCompetency().getValue();
            if (getCoreCompetency().getValue() == ""){
                coreCompetencyString = "Core Competency: Data not available";
                isEmpty++;
            }
            if (isEmpty == 5){
                return "OOPS! This job does not seem to exist.";
            }
            return "\n" + idString + nameString + employerString + locationString + positionString + coreCompetencyString + "\n";
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
