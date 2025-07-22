package ru.java.education.dz2.televisor;

public class Televisor {
    Televisor(String model){
        current_channel_ = MIN_CHANNEL;
        is_turned_on_ = false;
        model_ = model;
    }
    public final static int MIN_CHANNEL = 1;
    public final static int MAX_CHANNEL = 99;

    // Включает телевизор.
    public void TurnOn()
    {
        is_turned_on_ = true;
    }

    // Выключает телевизор.
    public void TurnOff()
    {
        is_turned_on_ = false;
    }

    public final boolean IsTurnedOn()
    {
        return is_turned_on_;
    }

    public final int GetCurrentChannel()
    {
        return is_turned_on_ ? current_channel_ : 0;
    }

    // Выбирает канал с указанным номером.
    public boolean SelectChannel(int channel)
    {
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL || !is_turned_on_) {
            return false;
        }
        current_channel_ = channel;
        return true;
    }

    public String GetTVName()
    {
        return model_;
    }

    private boolean is_turned_on_ = false;
    private int current_channel_ = 0;
    private String model_;
}
