package designexample.gooddesign;

import java.time.LocalDate;

public class Client {

    private Long id;
    private String name;
    private Email email;
    /*
    With that we have a business logic encapsulation, when all validations about email, will be at one place,
    the class will be immutable, with easier maintenance, and the domain model speaks in business terms rather than primitive types.
	Just a disclaimer. Remember that not everything needs to be a Value Object, we should only introduce then when they
	add business meaning. For example, LocalDate is enough to represents a simple birthday.
     */
    private LocalDate birthday;
    private String membershipLevel;
    private String loyaltyPoints;

    public Client(String name, Email email, LocalDate birthday, String membershipLevel, String loyaltyPoints) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.membershipLevel = membershipLevel;
        this.loyaltyPoints = loyaltyPoints;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public String getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
