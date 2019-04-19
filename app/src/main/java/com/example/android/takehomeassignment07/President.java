package com.example.android.takehomeassignment07;

public class President {
        private String name;
        private String info;
        private int photo;

        public President (String name, String info, int photo){
            this.name = name;
            this.info = info;
            this.photo = photo;
        }

        public String getName() {
            return name;
        }

        public String getInfo() {
            return info;
        }

        public int getPhotoId() {
            return photo;
        }
    }


