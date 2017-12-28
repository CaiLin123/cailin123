package com.lanou3g.study;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface ExecutrInter {
    Statement execute(Connection conn) throws SQLException;
}
