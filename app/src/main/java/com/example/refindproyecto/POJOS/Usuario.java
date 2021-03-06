package com.example.refindproyecto.POJOS;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private int foto;
    private String usuFire;
    private String biografia;
    private Integer seguidores;
    private Integer siguiendo;
    private Integer comentarios;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email, String biografia, Integer seguidores, Integer siguiendo, Integer comentarios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.biografia = biografia;
        this.seguidores = seguidores;
        this.siguiendo = siguiendo;
        this.comentarios = comentarios;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuFire() {
        return usuFire;
    }

    public void setUsuFire(String usuFire) {
        this.usuFire = usuFire;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Integer getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Integer seguidores) {
        this.seguidores = seguidores;
    }

    public Integer getSiguiendo() {
        return siguiendo;
    }

    public void setSiguiendo(Integer siguiendo) {
        this.siguiendo = siguiendo;
    }

    public Integer getComentarios() {
        return comentarios;
    }

    public void setComentarios(Integer comentarios) {
        this.comentarios = comentarios;
    }
}
