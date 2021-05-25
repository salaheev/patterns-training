package org.patterns.builder;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class User {

    private int id;
    private String name;
    private String address;
    private byte[] image;

    private User() {
    }

    public static UserBuilder builder() {

        return new UserBuilder();
    }

    public static class UserBuilder {

        private final User person;

        public UserBuilder() {
            this.person = new User();
        }

        public User build() {

            return person;
        }

        public UserBuilder id(int id) {

            person.id = id;
            return this;
        }

        public UserBuilder name(String name) {

            person.name = name;
            return this;
        }

        public UserBuilder address(String address) {

            person.address = address;
            return this;
        }

        public UserBuilder image(byte[] bytes) {

            person.image = bytes;
            return this;
        }

    }
}
