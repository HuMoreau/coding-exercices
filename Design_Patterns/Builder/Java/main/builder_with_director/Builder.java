package builder_with_director;

public interface Builder {

    void setOptionA(String optionA);

    void setOptionB(int optionB);

    void setOptionC(boolean optionC);

    // Note that we don't include the buildProduct() function as it return type can't be determined (at least I imagine
    // it is the reason).
}
