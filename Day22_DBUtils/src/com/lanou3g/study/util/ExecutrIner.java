package com.lanou3g.study.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface ExecutrIner {
    Statement execute (Connection conn) throws SQLException ;

}
