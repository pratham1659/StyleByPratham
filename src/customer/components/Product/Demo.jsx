import {
  FormControl,
  FormControlLabel,
  FormLabel,
  Radio,
  RadioGroup,
} from "@mui/material";
import React from "react";

const Demo = () => {
  return (
    <div>
      <FormControl>
        <FormLabel id="demo-radio-buttons-group-label">Gender</FormLabel>
        <RadioGroup
          aria-labelledby="demo-radio-buttons-group-label"
          defaultValue="female"
          name="radio-buttons-group">
          <FormControlLabel
            value={Option.value}
            control={<Radio />}
            label={Option.label}
          />
        </RadioGroup>
      </FormControl>
    </div>
  );
};

export default Demo;
