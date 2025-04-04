package designexample.baddesign;

import java.time.LocalDate;

public class Client {

    private Long id;
    private String name;
    /* Use Value Objects for immutable domain concepts */
    private String email;
    /*
    What will be the problem here? At some point, some business people will bring the demand:
    “The users are putting invalid emails, we have to accept only valid emails”.
    The developer to solve this demand, put some validation in the rest controller checking if the email contains ‘@’,
    if contains is valid email. After two months, a new requirement arises:
    “We must accept only business emails”. Another developer then adds validation at the repository to check
    whether the email contains ‘company.com’. And let’s imagine that this validation has to be for all classes of
    application who contains email, like Client, Supplier, Contractor, etc. And after more two months the company make a
     partnership and will accept email from another company to. Can you see how an email change is becoming so complex to change?
     */

    private LocalDate birthday;
    private String membershipLevel;
    private String loyaltyPoints;

    public Client() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public String getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(String loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public void sendWelcomeEmail() {
        System.out.println("Sending email to " + this.email);
    }
}
