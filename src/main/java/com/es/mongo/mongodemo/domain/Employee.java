package com.es.mongo.mongodemo.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {

    @Id
    private String _id;

    private int id;

    private String name;

    private String fullName;

    private int groupId;

    private int dataGroupId;

    public Employee(int id, String name, String fullName, int groupId, int dataGroupId) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.groupId = groupId;
        this.dataGroupId = dataGroupId;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getDataGroupId() {
        return dataGroupId;
    }

    public void setDataGroupId(int dataGroupId) {
        this.dataGroupId = dataGroupId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "_id='" + _id + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", groupId=" + groupId +
                ", dataGroupId=" + dataGroupId +
                '}';
    }
}
