package com.srm.spring.api.vo;

public class Error {

    private String message;
    private String category;
    private String errcode;
    private String id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getId() {
        return id;
    }

    @Override
	public String toString() {
		return "Error [category=" + category + ", errcode=" + errcode + ", id=" + id + ", message=" + message + "]";
	}

	public void setId(String id) {
        this.id = id;
    }
}
