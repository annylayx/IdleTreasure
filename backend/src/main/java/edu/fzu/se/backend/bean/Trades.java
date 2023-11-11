package edu.fzu.se.backend.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("trades")
@Schema(name = "Trades", description = "交易")
public class Trades {
    @TableId(type = IdType.AUTO)
    @Schema(name = "Trade_ID", description = "交易ID")
    private Long Trade_ID;

    @Schema(name = "Buyer_ID", description = "买家ID")
    private Long Buyer_ID;

    @Schema(name = "Seller_ID", description = "卖家ID")
    private Long Seller_ID;

    @Schema(name = "Trade_Time", description = "交易时间")
    private String Trade_Time;

    @Schema(name = "Paid_Amount", description = "支付金额")
    private Double Paid_Amount;
}
