package com.banking.accounts.service;

import com.banking.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto - Customer Object
     */
    void createAccount(CustomerDto customerDto);
    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);

}
