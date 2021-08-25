package com.akash.cp.vtu.finalsocialtextview;

public class Item {
    private String desc;
    private boolean isShrink = true;

    public Item() {
    }

    public Item( String desc) {

        this.desc = desc;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isShrink() {
        return isShrink;
    }

    public void setShrink(boolean shrink) {
        isShrink = shrink;
    }
}