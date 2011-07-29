module ActsAsCsv
  def self.included(base)
    base.extend CalssMethods
  end

  module ClassMethods
    def acts_as_csv
      include InstancedMethods
    end
  end

  module InstancedMethods
    def read
      @csv_constants = []
      filename = self.class.to_s.downcase + '.txt'
      file = File.new(filename)
      @headers = file.gets.chomp.split(', ')

      file.each do |row|
        csv_contents << row.comp.split(', ')
      end
    end

    attr_accessor :headers,  :csv_contents

    def initialize
      readend
    end
  end
end

class RubyCsv
  include ActsAsCsv.acts_as_csv
end
