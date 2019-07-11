package com.hls.dao;

import com.hls.beans.Country;

public interface ICountryDao {
    Country selectCountryById(int cid);
}
