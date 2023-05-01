package bo.edu.ucb.todo.dto;

import java.util.*;

public class TaskDto {
    private Integer taskId;
    private String description;
    private String date;
    private String labelIds;
    private String estado;

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estados){
        this.estado = estados;
    }

    public TaskDto() {
    }


    public Integer getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLabelIds() {
        return this.labelIds;
    }

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }


    @Override
    public String toString() {
        return "{" +
            " taskId='" + getTaskId() + "'" +
            ", description='" + getDescription() + "'" +
            ", date='" + getDate() + "'" +
            ", labelIds='" + getLabelIds() + "'" +
            ", estado='" + getEstado()+ "'" +
            "}";
    }


}