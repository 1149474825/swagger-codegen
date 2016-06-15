package io.swagger.client.api;

import io.swagger.client.ApiClient;

import org.joda.time.LocalDate;
import java.math.BigDecimal;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface FakeApi extends ApiClient.Api {


  /**
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * @param number None (required)
   * @param _double None (required)
   * @param string None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional)
   * @param password None (optional)
   * @return void
   */
  @RequestLine("POST /fake")
  @Headers({
    "Content-type: application/xml; charset&#x3D;utf-8",
    "Accept: application/xml; charset&#x3D;utf-8,application/json; charset&#x3D;utf-8",
  })
  void testEndpointParameters(@Param("number") BigDecimal number, @Param("_double") Double _double, @Param("string") String string, @Param("_byte") byte[] _byte, @Param("integer") Integer integer, @Param("int32") Integer int32, @Param("int64") Long int64, @Param("_float") Float _float, @Param("binary") byte[] binary, @Param("date") LocalDate date, @Param("dateTime") DateTime dateTime, @Param("password") String password);
}
