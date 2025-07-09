<<<<<<< HEAD
export const calculateProfit = (order) => {
  if (order && order.orderItem?.buyPrice && order.orderItem?.sellPrice) {
    return order.orderItem?.sellPrice - order.orderItem?.buyPrice;
  }
  return "-";
};
=======
export const calculateProfit = (order) => {
  if (order && order.orderItem?.buyPrice && order.orderItem?.sellPrice) {
    return order.orderItem?.sellPrice - order.orderItem?.buyPrice;
  }
  return "-";
};
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
