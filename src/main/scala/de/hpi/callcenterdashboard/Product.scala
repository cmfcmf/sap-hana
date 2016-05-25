package de.hpi.callcenterdashboard

import java.sql.ResultSet

class Product(result: ResultSet) {
  val id = result.getString("MATERIAL")
  val name = result.getString("TEXT")
  val sales_sum = Money(result.getBigDecimal("AMOUNT"), result.getString("HAUS_WAEHRUNG"))
}